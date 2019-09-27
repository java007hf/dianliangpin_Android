package com.xsoft.dianliangpin;

import android.util.Log;

import com.xsoft.dianliangpin.beans.User;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetService {
    private static final String TAG = "NetService";
    private static final String BASE_URL = "http://10.91.45.103:8080/";
    private static NetService sNetConfig;
    private Retrofit mRetrofit;

    private NetService() {

    }

    public static NetService getInstance() {
        if (sNetConfig == null) {
            sNetConfig = new NetService();
        }
        return sNetConfig;
    }

    public void init() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) //设置网络请求的Url地址
                .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
                .build();
    }

    public void testHello() {
        GetRequest_Interface getRequest_interface = mRetrofit.create(GetRequest_Interface.class);
        Call<ResponseBody> call1 = getRequest_interface.testHello();

        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse testHello " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure testHello " + t);
            }
        });
    }

    public void testGetTime(int index) {
        GetRequest_Interface getRequest_interface = mRetrofit.create(GetRequest_Interface.class);
        Call<ResponseBody> call1 = getRequest_interface.testGetTime(index);

        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse testGetTime " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure testGetTime " + t);
            }
        });
    }

    public void addUser(User user) {
        GetRequest_Interface getRequest_interface = mRetrofit.create(GetRequest_Interface.class);
        Call<ResponseBody> call1 = getRequest_interface.addUser(user);

        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse addUser " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure addUser " + t);
            }
        });
    }

    public void delUser(Long id) {
        GetRequest_Interface getRequest_interface = mRetrofit.create(GetRequest_Interface.class);
        Call<ResponseBody> call1 = getRequest_interface.deleteUser(id);

        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse delUser " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure delUser " + t);
            }
        });
    }

    public void updateUser(Long id, User user) {
        GetRequest_Interface getRequest_interface = mRetrofit.create(GetRequest_Interface.class);
        Call<ResponseBody> call1 = getRequest_interface.updateUser(id, user);

        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse updateUser " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure updateUser " + t);
            }
        });
    }

    public void updateUserName(Long id, String name) {
        GetRequest_Interface getRequest_interface = mRetrofit.create(GetRequest_Interface.class);
        Call<ResponseBody> call1 = getRequest_interface.updateUserName(id, name);

        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse updateUserName " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure updateUserName " + t);
            }
        });
    }

    public void getUser(Long id) {
        GetRequest_Interface getRequest_interface = mRetrofit.create(GetRequest_Interface.class);
        Call<ResponseBody> call1 = getRequest_interface.getUser(id);

        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse getUser " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure getUser " + t);
            }
        });
    }

    public void getUserList() {
        GetRequest_Interface getRequest_interface = mRetrofit.create(GetRequest_Interface.class);
        Call<ResponseBody> call1 = getRequest_interface.getUserList();

        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d(TAG, "onResponse getUserList " + response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d(TAG, "onFailure getUserList " + t);
            }
        });
    }
}
