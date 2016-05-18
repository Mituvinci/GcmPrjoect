package com.example.rasel.gcmprjoect.interfacepack;


import com.example.rasel.gcmprjoect.NotificationModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;



/**
 * Created by mitu on 5/17/16.
 */
public interface NotificationInterface {
    @POST("AppApi/PushNotification/AddUser")
    Call<NotificationModel> getnotificationRequest(@Body String limitModelDealDetails);
}
