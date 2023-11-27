package Lab1;

import java.util.Scanner;

public class News implements INews{
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    private int[] RateList = new int[3];

    public News(int ID, String title, String publishDate, String author, String content) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setAverageRate(float averageRate) {
        AverageRate = averageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: "+Title);
        System.out.println("PublishDate: "+PublishDate);
        System.out.println("Author: "+Author);
        System.out.println("Content: "+Content);
        System.out.println("AverageRate: "+AverageRate);
    }

    public void Calculate() {
        float total = 0;
        for (int rate : RateList) {
            total += rate;
        }
        AverageRate = total / RateList.length;
    }

    public void InputRate(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 3 rate (1-5)");
        for (int i =0;i<RateList.length;i++){
            System.out.println("Rate"+(i+1)+":");
            RateList[i]=scanner.nextInt();
        }
        Calculate();
    }
}
