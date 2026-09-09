public class DesafioStringMethodsPart2 {
    // Write your methods here

    public static String formatCourseInfo(String course){
        String[] split = course.split(":");
        String result = "Course Code: " + split[0] + "\nCourse Name: " + split[1] + "\nDays: " + split[2] + "\nTime: " + split[3];

        return result;
    }

    public static String createCourseList(String[] courseList){
        String part1 = "Available Courses: ";
        String courses = String.join(", ", courseList);
        String result = part1 + courses;

        return result;
    }

    public static String formatSchedule(String days){
        String[] split = days.split(",");
        String together = String.join(" | ", split);

        return together;
    }
    
    
    public static void main(String[] args) {
        // Test data
        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        String days = "Monday,Wednesday,Friday";
        
        // Test your methods
        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));
        
        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));
        
        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));
    }
}
