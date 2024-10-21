package lab9;

public class lab9 {
	
public static void main(String[] args) {
		
		// Immutable failed student
        FailedStudent failedStudent = new FailedStudent(75, "SE-150T", "Data Structures");
        System.out.println("Failed Student Details:");
        System.out.println("Roll Number: " + failedStudent.getrollNumber ());
        System.out.println("Subject Code: " + failedStudent.getSubjectCode());
        System.out.println("Subject Name: " + failedStudent.getSubjectName());

        // Mutable promoted student
        PromotedStudent promotedStudent = new PromotedStudent(89, "SE-423T", "Software Construction And Dev");
        System.out.println("\nPromoted Student Details:");
        System.out.println("Roll Number: " + promotedStudent.getRollNumber());
        System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
        System.out.println("Subject Name: " + promotedStudent.getSubjectName());

        // Updating promoted student details
        promotedStudent.setSubjectCode("SE-210T");
        promotedStudent.setSubjectName("Discrete Mathematics");

        System.out.println("\nUpdated Promoted Student Details:");
        System.out.println("Roll Number: " + promotedStudent.getRollNumber());
        System.out.println("Subject Code: " + promotedStudent.getSubjectCode());
        System.out.println("Subject Name: " + promotedStudent.getSubjectName());
    }
		

	}