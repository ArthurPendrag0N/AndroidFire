/*
 * Copyright (c) 2016 咖枯 <kaku201313@163.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.jaydenxiao.androidfire.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class NewsPhotoDetail implements Parcelable {
    public static final Creator<NewsPhotoDetail> CREATOR = new Creator<NewsPhotoDetail>() {
        @Override
        public NewsPhotoDetail createFromParcel(Parcel source) {
            return new NewsPhotoDetail(source);
        }

        @Override
        public NewsPhotoDetail[] newArray(int size) {
            return new NewsPhotoDetail[size];
        }
    };
    private String title;
    private List<Picture> pictures;

    public NewsPhotoDetail() {
    }

    protected NewsPhotoDetail(Parcel in) {
        this.title = in.readString();
        this.pictures = new ArrayList<>();
        in.readList(this.pictures, Picture.class.getClassLoader());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeList(this.pictures);
    }

    public static class Picture implements Parcelable {
        public static final Creator<Picture> CREATOR = new Creator<Picture>() {
            @Override
            public Picture createFromParcel(Parcel source) {
                return new Picture(source);
            }

            @Override
            public Picture[] newArray(int size) {
                return new Picture[size];
            }
        };
        private String title;
        private String imgSrc;

        public Picture() {
        }

        protected Picture(Parcel in) {
            this.title = in.readString();
            this.imgSrc = in.readString();
        }

        public String getImgSrc() {
            return imgSrc;
        }

        public void setImgSrc(String imgSrc) {
            this.imgSrc = imgSrc;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.title);
            dest.writeString(this.imgSrc);
        }
    }
}
