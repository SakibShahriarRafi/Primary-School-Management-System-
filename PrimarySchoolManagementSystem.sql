use RainbowPrimarySchool;
create table StudentTable(
	studentId int identity(100,1) primary key  ,
	studentFirstName varchar(50) not null,
	studentLastName varchar(50) not null ,

	studentFatherName varchar (100) not null,
	studentMotherName varchar (100) not null ,

	studentDOB date not null,
	studentBG varchar(10),

	studentParentPhone varchar(15) not null,
	studentEmail varchar(50) not null,

	studentAddress varchar(500),
	studentAccountNo varchar(100) not null,

	studentCurentClass int not null,
	studentSection varchar(20) not null,
	StudentCurrentRoll int null,

	studentAdmissionDate date not null,
	studentGraduationDate date,

	studentUsername varchar(100) not null,
	studentPassword varchar(100) not null,

	studentPayableMoney money default 0,
	isCurrentStudent bit not null,
	PaymentScale money

);


create table TeacherTable(
	teacherId int identity(200,1) primary key,
	teacherFirstName varchar(50)not null,
	teacherLastName varchar(50) not null,

	teacherDOB date not null,
	teacherBG varchar(10),

	teacherPhone varchar(20) not null,
	teacherEmail varchar(50) not null,

	teacherNID varchar(100) not null,
	teacherAccountNo varchar(100) not null,

	teacherCourse varchar(500) not null,

	teacherAddress varchar(500) ,
	
	teacherPayableMoney money default 0,
	teacherSalaryScale money not null,

	teacherJoinDate date not null,
	teacerResignDate date,

	teacherUsername varchar(100) not null,
	teacherPassword varchar(50) not null,
	isCurrentTeacher bit not null


);
create table StaffTable(
	staffId int identity(300,1) primary key,
	staffFirstName varchar(50) not null,
	staffLastName varchar(50) not null, 


	staffDOB date not null, 
	staffBG varchar(10),

	staffPhone varchar(20) not null, 
	staffEmail varchar(50) ,

	staffNID varchar(100) not null,
	staffAccountNo varchar(50) not null,

	staffJobDesignation varchar(100) not null, 
	staffAddress varchar(500),
	
	
	staffPayableMoney money default 0,	
	staffSalaryScale money not null, 


	staffJoinDate date not null,
	staffResignDate date,

	staffUsername varchar(100) not null,
	staffPassword varchar(50) not null,
	isCurrentStaff bit not null

);

create table CourseTable(
	courseId varchar(20) primary key not null, 
	courseName varchar(50) not null
);

/*
create table EnrollmentTable(
	enrollmentId int identity(400,1) primary key, 
	courseId varchar(50) FOREIGN KEY REFERENCES CourseTable(courseId),
	studentId int FOREIGN KEY REFERENCES StudentTable(studentId),
	teacherId int FOREIGN KEY REFERENCES TeacherTable(teacherId)
	

);

*/

CREATE TABLE EnrollmentTable (
    enrollmentId INT identity(400,1) PRIMARY KEY,
    courseId varchar(20),
    studentId INT,
    teacherId INT,
    CONSTRAINT FK_Course FOREIGN KEY (courseId) REFERENCES CourseTable(courseId),
    CONSTRAINT FK_Student FOREIGN KEY (studentId) REFERENCES StudentTable(studentId),
    CONSTRAINT FK_Teacher FOREIGN KEY (teacherId) REFERENCES TeacherTable(teacherId)
);

CREATE TABLE GradeTable (
    gradingId INT identity(500,1) PRIMARY KEY,
    studentId INT,
    teacherId INT,
    courseId varchar(20),
    studentClass INT,
    studentSection VARCHAR(20),
    studentRoll INT,
    obtainedMarks DECIMAL(5, 3),
    obtainedGrade varchar(5),
    isPassed BIT,
    CONSTRAINT FK_Student2 FOREIGN KEY (studentId) REFERENCES StudentTable(studentId),
    CONSTRAINT FK_Teacher2 FOREIGN KEY (teacherId) REFERENCES TeacherTable(teacherId),
    CONSTRAINT FK_Course2 FOREIGN KEY (courseId) REFERENCES CourseTable(courseId)
);

CREATE TABLE TransactionTable (
    transactionid INT identity(600,1) PRIMARY KEY,
    account_no VARCHAR(100),
    studentID INT,
    teacherid INT,
    staffid INT,
    paidAmount MONEY,
    payable_money MONEY,
	transactionMonth varchar(15),
    transactiondate DATE,
    CONSTRAINT FK_Student3 FOREIGN KEY (studentID) REFERENCES StudentTable(studentId),
    CONSTRAINT FK_Teacher3 FOREIGN KEY (teacherid) REFERENCES TeacherTable(teacherId),
    CONSTRAINT FK_Staff3 FOREIGN KEY (staffid) REFERENCES StaffTable(staffId)
);

CREATE TABLE FinalGradeTable (
    finalGradeId INT identity(700,1) PRIMARY KEY,
    studentId INT,
    totalObtainedMarks DECIMAL(10, 3),
    isAllCoursesPassed BIT,
    CONSTRAINT FK_Student4 FOREIGN KEY (studentId) REFERENCES StudentTable(studentId)
);

--drop TABLE StudentTable;
--drop TABLE TeacherTable;
--drop TABLE StaffTable;
--truncate table StudentTable;
--truncate table TeacherTable;
--truncate table StaffTable;
--drop table CourseTable
--drop table gradetable;
--drop table TransactionTable;

select * from StudentTable;
select * from TeacherTable; 
select * from StaffTable; 
select * from CourseTable;
select * from EnrollmentTable;
select * from gradetable;
select * from TransactionTable;
select * from FinalGradeTable;
