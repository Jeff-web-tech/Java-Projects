public static void executeGradeReport(double score){
    if (!validateScore(score)){
        System.out.println("Invalid Score");
        return;
    }

    char grade = calculateLetterGrade(score);

    displayPerformanceMessage(grade);
}
