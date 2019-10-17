package com.codemen.applicationretrofit2.Services

import com.google.gson.annotations.SerializedName

data class DogsResponse (@SerializedName("status") var status:String,
                         @SerializedName("message") var images: List<String>) {


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DogsResponse

        if (status != other.status) return false
        if (images != other.images) return false

        return true
    }

    override fun hashCode(): Int {
        var result = status.hashCode()
        result = 31 * result + images.hashCode()
        return result
    }
}