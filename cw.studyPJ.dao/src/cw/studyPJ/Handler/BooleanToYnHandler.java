package cw.studyPJ.Handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class BooleanToYnHandler implements TypeHandler<Boolean> {
	//
	@Override
	public Boolean getResult(ResultSet rs, String columnName) throws SQLException {
		//
		if("Y".equals(rs.getString(columnName))) {
			return true;
			//return Boolean.TRUE;
		} else {
			return false;
		}
	}

	@Override
	public Boolean getResult(ResultSet rs, int columnIndex) throws SQLException {
		//
		if("Y".equals(rs.getString(columnIndex))) {
			return true;
			//return Boolean.TRUE;
		} else {
			return false;
		}
	}

	@Override
	public Boolean getResult(CallableStatement arg0, int arg1) throws SQLException {
		//
		return null;
	}

	@Override
	public void setParameter(PreparedStatement pstmt, int paramIndex, Boolean param, JdbcType jdbc) throws SQLException {
		//
		if(param) {
			pstmt.setString(paramIndex, "Y");
		} else {
			pstmt.setString(paramIndex, "N");
		}
		
	}

}
