
package com.doublechaintech.retailscm.employeeeducation;
import com.doublechaintech.retailscm.Beans;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.math.BigDecimal;
import com.doublechaintech.retailscm.BaseRowMapper;
import com.doublechaintech.retailscm.employee.Employee;

public class EmployeeEducationMapper extends BaseRowMapper<EmployeeEducation>{

	protected EmployeeEducation internalMapRow(ResultSet rs, int rowNumber) throws SQLException{
		EmployeeEducation employeeEducation = getEmployeeEducation();
		
 		setId(employeeEducation, rs, rowNumber);
 		setEmployee(employeeEducation, rs, rowNumber);
 		setCompleteTime(employeeEducation, rs, rowNumber);
 		setType(employeeEducation, rs, rowNumber);
 		setRemark(employeeEducation, rs, rowNumber);
 		setVersion(employeeEducation, rs, rowNumber);

    
		return employeeEducation;
	}

	protected EmployeeEducation getEmployeeEducation(){
	  EmployeeEducation entity = new EmployeeEducation();
	  Beans.dbUtil().markEnhanced(entity);
		return entity;
	}
		
	protected void setId(EmployeeEducation employeeEducation, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		String id = rs.getString(EmployeeEducationTable.COLUMN_ID);
		
		if(id == null){
			//do nothing when nothing found in database
			return;
		}
		
		employeeEducation.setId(id);
		}catch (SQLException e){

    }
	}
		
 	protected void setEmployee(EmployeeEducation employeeEducation, ResultSet rs, int rowNumber) throws SQLException{
 		String employeeId;
 		try{
 		  employeeId = rs.getString(EmployeeEducationTable.COLUMN_EMPLOYEE);
 		}catch(SQLException e){
 		  return;
 		}
 		if( employeeId == null){
 			return;
 		}
 		if( employeeId.isEmpty()){
 			return;
 		}
 		Employee employee = employeeEducation.getEmployee();
 		if( employee != null ){
 			//if the root object 'employeeEducation' already have the property, just set the id for it;
 			employee.setId(employeeId);

 			return;
 		}
 		employeeEducation.setEmployee(createEmptyEmployee(employeeId));
 	}
 	
	protected void setCompleteTime(EmployeeEducation employeeEducation, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		Date completeTime = rs.getDate(EmployeeEducationTable.COLUMN_COMPLETE_TIME);
		
		if(completeTime == null){
			//do nothing when nothing found in database
			return;
		}
		
		employeeEducation.setCompleteTime(completeTime);
		}catch (SQLException e){

    }
	}
		
	protected void setType(EmployeeEducation employeeEducation, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		String type = rs.getString(EmployeeEducationTable.COLUMN_TYPE);
		
		if(type == null){
			//do nothing when nothing found in database
			return;
		}
		
		employeeEducation.setType(type);
		}catch (SQLException e){

    }
	}
		
	protected void setRemark(EmployeeEducation employeeEducation, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		String remark = rs.getString(EmployeeEducationTable.COLUMN_REMARK);
		
		if(remark == null){
			//do nothing when nothing found in database
			return;
		}
		
		employeeEducation.setRemark(remark);
		}catch (SQLException e){

    }
	}
		
	protected void setVersion(EmployeeEducation employeeEducation, ResultSet rs, int rowNumber) throws SQLException{
    try{
		//there will be issue when the type is double/int/long
		
		Integer version = rs.getInt(EmployeeEducationTable.COLUMN_VERSION);
		
		if(version == null){
			//do nothing when nothing found in database
			return;
		}
		
		employeeEducation.setVersion(version);
		}catch (SQLException e){

    }
	}
		


 	protected Employee  createEmptyEmployee(String employeeId){
 		Employee employee = new Employee();
 		employee.setId(employeeId);
 		employee.setVersion(Integer.MAX_VALUE);
 		return employee;
 	}
 	
}


