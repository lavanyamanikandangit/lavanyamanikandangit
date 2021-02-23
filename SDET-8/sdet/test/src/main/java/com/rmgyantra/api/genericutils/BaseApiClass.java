package com.rmgyantra.api.genericutils;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseApiClass {
@BeforeSuite
public void configBeforeSuite() {
	baseURI="http://localhost";
	port = 8084;
	DataBaseUtilities.connectToDB();
}
@AfterSuite
public void configAfterSuite() throws SQLException {
	DataBaseUtilities.closeDb();
}
}