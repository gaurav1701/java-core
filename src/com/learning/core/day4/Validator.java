package com.learning.core.day4;

public class Validator {
	
	public void validate(Applicant applicant) throws CatheyBankException {
        if (isValidApplicantName(applicant.applicantName)) {
            throw new InvalidNameException("Invalid Applicant Name");
        }
        else if (!isValidPost(applicant.postApplied)) {
            throw new InvalidPostException("Invalid Post");
        }
        else if (!isValidAge(applicant.applicantAge)) {
            throw new InvalidAgeException("Invalid Age");
        }else
        System.out.println("All details are valid");
    }

    public static boolean isValidApplicantName(String name) {
    	//return name != null && !name.isEmpty();
    	return name.equals("Mary") || name.equals("Joseph");
    }

    public static boolean isValidPost(String post) {
        return post.equals("Probationary_Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer");
    }

    public static boolean isValidAge(int age) {
        return age > 18 && age <= 30;
    }

}
