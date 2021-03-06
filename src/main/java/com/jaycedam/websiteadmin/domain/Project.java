package com.jaycedam.websiteadmin.domain;

import javax.persistence.*;

@Entity
@Table
public class Project {
    @Id
    @SequenceGenerator(
            name="project_sequence",
            sequenceName = "project_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "project_sequence"
    )

    private Long id;
    private String name;
    private String technology;
    private String about;
    private String url;
    private String imageUrl;
    private Boolean starred;
    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;

    public Project() {
    }

    public Project(String name, String technology, String about, String url, String imageUrl, Area area, Boolean starred) {
        this.name = name;
        this.technology = technology;
        this.about = about;
        this.url = url;
        this.imageUrl = imageUrl;
        this.area = area;
        this.starred = starred;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", technology='" + technology + '\'' +
                ", about='" + about + '\'' +
                ", url='" + url + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", area=" + area +
                '}';
    }
}
