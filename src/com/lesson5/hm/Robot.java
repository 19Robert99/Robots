package com.lesson5.hm;

public class Robot {
    private String code;
    private String commitedCode;
    private boolean isCodeWithBug;

    public Robot() {
        System.out.println("If your grade more than 5, your code is good!");
    }

    public void writeCode(String code) {
        this.code = code;
    }

    public String testCode() {
        if (!code.isEmpty()) {
            return "Success";
        }
        return "Failed";
    }

    public int reviewCode() {
        switch (code.length()) {
            case 5:
                isCodeWithBug = true;
                System.out.println("There is a bag in your code!");
                return 5;
            case 10:
                return 10;
            case 15:
                return 100;
            default:
                return 0;
        }
    }

    public void commitAndPush() {
        commitedCode = code;
    }

    public String lastCommit() {
        return commitedCode;
    }

    public void bugFix(String code) {
        if (isCodeWithBug) {
            this.code = code;
        } else {
            System.out.println("There no bugs in my code!");
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "code='" + code + '\'' +
                ", commitedCode='" + commitedCode + '\'' +
                ", isCodeWithBug=" + isCodeWithBug +
                '}';
    }
}
