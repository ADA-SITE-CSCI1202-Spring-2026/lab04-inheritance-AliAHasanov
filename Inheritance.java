public class Inheritance{
    public class Person {
        private String firstName;
        private String lastName;
        private String gender;

        public String getfirstname(){
            return firstName;
        }

        public void setfirstname(String name){
            this.firstName = name;
        }

        public String getlastname(){
            return lastName;
        }

        public void setlastname(String name){
            this.lastName = name;
        }

        public String getgender(){
            return gender;
        }

        public void setgender(String gender){
            this.gender = gender;
        }

        public String toString(Person guy) {
            return guy.firstName + guy.lastName;
        }

        public boolean equals(Person p) {
            return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(gender);
        }

    }

    public class Teacher extends Person {
        private String department;
        private String courses;

        public void setdep(String dep) {
            this.department = dep;
        }

        public String getdep() {
            return department;
        }

        public void setcourse(String course) {
            this.courses = course;
        }

        public String getcourse() {
            return courses;
        }

        public String toString(Teacher guyTeacher) {
            return guyTeacher.courses + guyTeacher.department;
        }

        public boolean equals(Teacher guyTeacher) {
            return this.courses.equals(guyTeacher.courses) && this.department.equals(guyTeacher.department);
        }
    }
}