Sub-reports-in-JasperReports---iReport-with-Java-Beans
======================================================
This is the image for creating the sub-report datasource in the master report in the IReport Jasper Studio:
![screenshot](https://github.com/carloDev/Sub-reports-in-JasperReports---iReport-with-Java-Beans/blob/master/ds_subreport.PNG)

Create 3 different jars:
- a jar for the report beans (beans_report.jar)
- a jar for the factory of the master bean (master_report_factory.jar) with an associate data source in the Jasper Studio
- a jar(or multiple jars) for the factory of the children/s bean. One for each children bean! (children_report_factory.jar) with an associate data source in the Jasper Studio
