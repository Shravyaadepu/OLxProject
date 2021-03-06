package com.zensar.advertise.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdvertiseDetails {
       private long id;
       private String title;
       private double price;
       private String category;
       private String description;
       private String userName;
       private String createdDate;
       private String modifiedDate;
       private String status;
       private String postedBy;
}
