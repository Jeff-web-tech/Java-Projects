public class DateValidate {
    public static class Date{
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year){
            setDay(day);
            setMonth(month);
            setYear(year);
        }

        public int getDay(){
            return day;
        }

        public int getMonth(){
            return month;
        }

        public int getYear(){
            return year;
        }

        

        public void setDay(int day){
            if(day>=1 && day<=31){
                this.day = day;
            } else {
                System.out.println("Day must be between 1 and 31.");
            }
        }

        public void setMonth(int month){
            if(month >= 1 && month <= 12){
                this.month = month;
            } else {
                System.out.println("Month must be between 1 and 12.");
            }
        }

        public void setYear(int year){
            if (year > 0){
                this.year = year;
            } else {
                System.out.println("Year must be positive.");
            }
        }
    }
    public static void main(String[] args) {
        Date d = new Date(2,5,2023);
        System.out.println("Date: " + d.getDay() + "/" + d.getMonth() + "/" + d.getYear());

        d.setDay(5);
        d.setMonth(2);
        d.setYear(2026);

        System.out.println("\nNew Update: ");
        System.out.println("Date: " + d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
    }
    
}
