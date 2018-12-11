package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entiy.Patient;

/**
 * 
 * @ClassName: PatientDao
 * @Description: TODO
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class PatientDao {
	private DBManager db=new DBManager();

	// 查询patient表中userId满足要求的数
	public Patient patQuery(Patient p) throws SQLException {
		Patient pat=null;
		Connection c=db.openConnection();
		Object[] obs= {p.getUserId()};
		String sql="select *from Patient where userId=?";
		ResultSet re=db.query(c, sql, obs);
		while(re.next()) {
			pat=new Patient();
			pat.setUserId(re.getInt("userId"));
			pat.setMedicalId(re.getString("MedicalId"));
			pat.setCaseHistory(re.getString("CaseHistory"));
			pat.setCharge(re.getString("Charge"));
			pat.setPatName(re.getString("PatName"));
			pat.setPatSex(re.getString("PatSex"));
			pat.setPatNation(re.getString("Nation"));
			pat.setPregnant(re.getString("Pregnant"));
			pat.setPatBirth(re.getDate("PatBrith"));
			pat.setPatAge(re.getInt("PatAge"));
			pat.setPatWight(re.getFloat("PatWight"));
			pat.setPatTel(re.getString("PatTel"));   
			pat.setMarry(re.getString("Marray"));
			pat.setNatPlace(re.getString("NatPlace"));
			pat.setPatIdCard(re.getString("PatIdCard"));
			pat.setPatAddress(re.getString("PatAddress"));
			pat.setConAddress(re.getString("ConAddress"));
			pat.setLinkMan(re.getString("LinkMan"));
			pat.setAttnPhone(re.getString("AttnPhone"));
			pat.setAdmissTime(re.getTime("AdmissTime"));
			pat.setClinicDiagnosis(re.getString("ClinicDiagnosis"));
			pat.setDiagnosis1(re.getString("Diagnosis1"));
			pat.setDiagnosis2(re.getString("Diagnosis2"));
			pat.setDepId(re.getInt("DepId"));
			pat.setEmpId(re.getInt("EmpId"));
			pat.setBedId(re.getInt("BedId"));
			pat.setCardId(re.getInt("CardId"));
			pat.setPayWay(re.getString("PayWay"));
		}
		db.closeConnection(c);
		return pat;
	}

	//修改病人基本信息表(Patient)中数据
	public int update(Patient p) throws SQLException {
		int count=0;
		Connection c=db.openConnection();
		String sql="update Patient set MedicalId=?,CaseHistory=?,Charge=?,PatName=?,PatSex=?"
				+ "Nation=?,Pregnant=?,PatBrith=?,PatAge=?,PatWight=?,PatTel=?,Marray=?,NatPlace=?"
				+ "PatIdCard=?,PatAddress=?,ConAddress=?,LinkMan=?,AttnPhone=?,AdmissTime=?,"
				+ "ClinicDiagnosis=?,Diagnosis1=?,Diagnosis2=?,DepId=?,EmpId=?,BedId=?,CardId=?,"
				+ "PayWay=? where userId=?";
		Object[] obs= {p.getMedicalId(),p.getCaseHistory(),p.getCharge(),p.getPatName(),p.getPatSex(),
				p.getPatNation(),p.getPregnant(),p.getPatBirth(),p.getPatAge(),p.getPatWight(),p.getPatTel(),
				p.getMarry(),p.getNatPlace(),p.getPatIdCard(),p.getPatAddress(),p.getConAddress(),
				p.getLinkMan(),p.getAttnPhone(),p.getAdmissTime(),p.getClinicDiagnosis(),p.getDiagnosis1(),
				p.getDiagnosis2(),p.getDepId(),p.getEmpId(),p.getBedId(),p.getCardId(),p.getPayWay(),p.getUserId()};
		db.update(c, sql, obs);
		return count;
	}
	
	//添加病人信息
	public int patientadd(Patient p) throws SQLException {
		int count=0;
		Connection c=db.openConnection();
		String sql="insert into Patient( userId,MedicalId,CaseHistory,Charge,PatName,PatSex"
				+ "Nation,Pregnant,PatBrith,PatAge,PatWight,PatTel,Marray,NatPlace"
				+ "PatIdCard,PatAddress,ConAddress,LinkMan,AttnPhone,AdmissTime,"
				+ "ClinicDiagnosis,Diagnosis1,Diagnosis2,DepId,EmpId,BedId,CardId,"
				+ "PayWay) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] obs= {p.getUserId(),p.getMedicalId(),p.getCaseHistory(),p.getCharge(),p.getPatName(),p.getPatSex(),
				p.getPatNation(),p.getPregnant(),p.getPatBirth(),p.getPatAge(),p.getPatWight(),p.getPatTel(),
				p.getMarry(),p.getNatPlace(),p.getPatIdCard(),p.getPatAddress(),p.getConAddress(),
				p.getLinkMan(),p.getAttnPhone(),p.getAdmissTime(),p.getClinicDiagnosis(),p.getDiagnosis1(),
				p.getDiagnosis2(),p.getDepId(),p.getEmpId(),p.getBedId(),p.getCardId(),p.getPayWay()};
		count=db.update(c, sql, obs);
		db.closeConnection(c);
		return count;
	}
	
	//删除指定userId的病人信息
	public int delete(Patient p) throws SQLException {
		int count=0;
		Connection c=db.openConnection();
		String sql="delete from Patient where userId=?";
		Object[] obs= {p.getUserId()};
		count=db.update(c, sql, obs);
		db.closeConnection(c);
		return count;
	}
	
	
	
	
	
	
	
	
	
}
