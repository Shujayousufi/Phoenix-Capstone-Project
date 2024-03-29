package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.json.support.Status;


public class CucumberReportingConfig {
	public static void reportConfig() {
	File reportOutputDirectory = new File("target");
	
	List<String> jsonFiles = new ArrayList<>();
	jsonFiles.add("target/cucumber.json");
	

	String buildNumber = "1";
	String projectName = "Tek School Retail Website - CapStone";

	Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	// optional configuration - check javadoc for details
	configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
	// do not make scenario failed when step has status SKIPPED
	configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
	configuration.setBuildNumber(buildNumber);
	// Additional metadata presented on main page
	configuration.addClassifications("Platform", "Mac");
	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("Branch", "publish/1.0");

	ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	@SuppressWarnings("unused")
	Reportable result = reportBuilder.generateReports();
	// and here validate 'result' to decide what to do if report has failed

	}
}
