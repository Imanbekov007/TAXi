package classes;

import java.time.LocalDate;

public class License {
    private Long id;
    private LocalDate dateOfIssue;
    private LocalDate expiration;

    public License(Long id, LocalDate dateOfIssue, LocalDate expiration) {
        this.id = id;
        this.dateOfIssue = dateOfIssue;
        this.expiration = expiration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return "License{" +
                "id=" + id +
                ", dateOfIssue=" + dateOfIssue +
                ", expiration=" + expiration +
                '}';
    }
}
