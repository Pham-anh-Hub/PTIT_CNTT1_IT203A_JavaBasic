package HN_KS24_CNTT1_PhamPhuongAnh;

public class Student {
        public String id;
        public String name;
        public double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public String getRank(){
        if(this.score >= 8){
            return "Gioi";
        } else if (this.score >= 6.5) {
            return "Kha";
        }else if (this.score < 6.5){
            return "Trung binh";
        }
        return "Yeu";
    }

    @Override
    public String toString() {
        return (this.id + " | " + this.name + " | " + this.score + " | " + this.getRank());
    }
}
