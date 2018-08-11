import java.util.*;
class StudentOperationImplementation implements StudentArrayOperation
{
    private Student[] array=null;
    public Student[] getStudents()
    {
        return array;
    }

    public void setStudents(Student[] students)
    {
        if (students==null)
            throw new IllegalArgumentException("Array is empty");
        else
            this.array = students;
    }

    public Student getStudent(int index)
    {
        if(index<0 || index>= this.array.length)
            throw new IllegalArgumentException("Index out of bound");
        else
            return this.array[index];
    }

    public void setStudent(Student student, int index)
    {
        if(student == null)
            throw new IllegalArgumentException("Null object");
        else
            this.array[index] = student;
    }

    public void addFirst(Student student)
    {
        if(student==null)
            throw new IllegalArgumentException("Student is null");
        //need to implement
        else
        {
            int l;
            if (this.array!=null)
                l = this.array.length;
            else
                l = 0;
            Student [] s=new Student[l+1];
            for(int i=0;i<l;i++)
            {
                s[i+1] = this.array[i];
            }
            s[0]=student;
            this.array = s;
        }

    }
    public void addLast(Student student)
    {
        if(student == null)
            throw new IllegalArgumentException("Student is null");
        else
        {
            int l;
            if (this.array!=null)
                l = this.array.length;
            else
                l = 0;
            Student [] s=new Student[l+1];
            for(int i=0;i<l;i++)
            {
                s[i] = this.array[i];
            }
            s[l]=student;
            this.array = s;
        }
    }

    public void remove(int index)
    {
        if(index<0 || index>=this.array.length)
            throw new IllegalArgumentException("Index out of bound");
        else
        {
            int i;
            int n = this.array.length;
            Student[] s = new Student[n-1];
            for(i=0;i<index;i++)
                s[i]=this.array[i];
            while(i<n-1){
                s[i]=this.array[i+1];
                i++;
            }
            this.array=s;
            
        }
    }
    public void remove(Student student)
    {
        int n = this.array.length,i;
        for(i=0;i<n;i++)
            if(student == this.array[i])
                break;
        if(i==n)
            throw new IllegalArgumentException("Student Instance not found");
        else
        {
            int index=i;
            Student[] s = new Student[n-1];
            for(i=0;i<index;i++)
                s[i]=this.array[i];
            while(i<n-1){
                s[i]=this.array[i+1];
                i++;
            }
            this.array=s;
        }
            
    }
    public void bubbleSort()
    {
        int n = this.array.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if (this.array[j].compareTo(this.array[j+1])>0)
                {
                    Student t = this.array[j];
                    this.array[j] = this.array[j+1];
                    this.array[j+1] = t;
                }
            }
        }
    }


    
}