public class Student {
    final int id;
    String name;
    void setName(String name){
        if(name == null){
            throw new IllegalArgumentException("名字为空");
        }else{
            this.name = name;
        }
    }
    Student(String name,int id){
        if(name == null){
            throw new IllegalArgumentException("名字为空");
        }else{
            this.name = name;
            this.id = id;
        }
    }
    @Override
    public String toString(){
        return id + "-" + name;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(!(obj instanceof Student)) return false;
        Student other = (Student) obj; //other好比临时变量，转型用
        return this.id == other.id;
    }
    //todo 重写hashcode
}
