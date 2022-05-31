package com.metajrs.service;

import com.metajrs.mapper.getImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class getuserImage implements getImage {
    @Qualifier("getImage")
    @Autowired
    private getImage image;
    @Override
    public String getImage(String id) {
        return image.getImage(id);
    }
}
