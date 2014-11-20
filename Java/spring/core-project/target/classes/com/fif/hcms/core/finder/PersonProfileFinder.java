package com.fif.hcms.core.finder;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fif.hcms.core.dto.PersonAssignmentProfileDTO;
import com.fif.hcms.core.dto.PersonAdapterDTO;

public interface PersonProfileFinder {
	
	public PersonAssignmentProfileDTO selectAssignmentByPersonId(@Param("personId") Long personId, @Param("companyId") Long companyId);
	
	public Long selectPersonIdByEmployeeNumber(@Param("employeeNumber") String employeeNumber, @Param("companyId") Long companyId, @Param("effectiveOnDate") Date effectiveOnDate );
	
	public PersonAdapterDTO getWorkingScheduleIdByPersonIdAndAttendanceDate(@Param("personId")Long personId, @Param("attendanceDate")Date attendanceDate);
	
	public Integer countActiveAssignmentEmployee(@Param("companyId") Long companyId, @Param("organizationId") Long organizationId, @Param("jobId") Long jobId, @Param("listJobFor") List<String> listJobFor);
}
