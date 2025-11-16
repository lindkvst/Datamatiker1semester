package ExamPrep.Prep07;

import java.time.LocalDate;

public class Event {
    private String title;
    private LocalDate date;
    private String description;

    public Event(String title, LocalDate date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    //getters og setters

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Date: " + date + ", Description: " + description;
    }


}
