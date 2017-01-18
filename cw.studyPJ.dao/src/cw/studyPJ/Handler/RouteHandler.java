package cw.studyPJ.Handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import cw.studyPJ.domain.RouteEnum;

public class RouteHandler implements TypeHandler<RouteEnum>{
	

	@Override
	public RouteEnum getResult(ResultSet rs, String columnName) throws SQLException {
		//
		String routeCode = rs.getString(columnName);
		return RouteEnum.getByCode(routeCode);
	}

	@Override
	public RouteEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
		//
		String routeCode = rs.getString(columnIndex);
		return RouteEnum.getByCode(routeCode);
	}

	@Override
	public RouteEnum getResult(CallableStatement cstmt, int columnIndex) throws SQLException {
		//
		String routeCode = cstmt.getString(columnIndex);
		return RouteEnum.getByCode(routeCode);
	}

	public void setParameter(PreparedStatement pstmt, int paramIndex, RouteEnum param, JdbcType jdbcType) throws SQLException {
		//
		pstmt.setString(paramIndex, param.getCode());
	}


}
