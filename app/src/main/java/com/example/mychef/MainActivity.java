package com.example.mychef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private GridView mGv;

    private Button mBanSubscribe;
    private Button mBanRecommend;
    private Button mBanCategory;
    private ImageButton mBanHome;
    private ImageButton mBanShopCar;
    private ImageButton btn_profile;
<<<<<<< HEAD
    private ImageButton btn_createRecipe;
=======
    private ImageButton mBanFavorites;
>>>>>>> 8ca20bbe8ded1bb5e37dab37030d9e3694af8f3b

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGv = (GridView) findViewById(R.id.home_gv);
        mGv.setAdapter(new HomeGridViewAdapter(MainActivity.this));

        //Button control
        mBanSubscribe = (Button) findViewById(R.id.Subscribe_button);
        mBanRecommend = (Button) findViewById(R.id.Recommend_button);
        mBanCategory = (Button) findViewById(R.id.Category_button);
        mBanHome = (ImageButton) findViewById(R.id.Home_Button);
        mBanShopCar = (ImageButton) findViewById(R.id.ShopCarButton);
        btn_profile = (ImageButton) findViewById(R.id.ProfileButton);
<<<<<<< HEAD
        btn_createRecipe = (ImageButton) findViewById(R.id.NewRecipeButton);
=======
        mBanFavorites = (ImageButton) findViewById(R.id.FavoritesButton);
>>>>>>> 8ca20bbe8ded1bb5e37dab37030d9e3694af8f3b
        setListeners();
    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        mBanSubscribe.setOnClickListener(onClick);
        mBanRecommend.setOnClickListener(onClick);
        mBanCategory.setOnClickListener(onClick);
        mBanHome.setOnClickListener(onClick);
        mBanShopCar.setOnClickListener(onClick);
        btn_profile.setOnClickListener(onClick);
<<<<<<< HEAD
        btn_createRecipe.setOnClickListener(onClick);
=======
        mBanFavorites.setOnClickListener(onClick);
>>>>>>> 8ca20bbe8ded1bb5e37dab37030d9e3694af8f3b
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.ShopCarButton:
                    intent = new Intent(MainActivity.this, ShopCarActivity.class);
                    break;
                case R.id.Category_button:
                    intent = new Intent(MainActivity.this, CategoryPageActivity.class);
                    break;
                case R.id.Home_Button:
                case R.id.Recommend_button:
                    intent = new Intent(MainActivity.this, MainActivity.class);
                    break;
                case R.id.Subscribe_button:
                    intent = new Intent(MainActivity.this, SubscribePageActivity.class);
                    break;
                case R.id.ProfileButton:
                    GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(MainActivity.this);
                    FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
                    if(acct == null && currentUser == null){
                        intent = new Intent(MainActivity.this, LoginActivity.class);
                    }
                    else {
                        intent = new Intent(MainActivity.this, ProfileActivity.class);
                    }
                    break;
<<<<<<< HEAD
                case R.id.NewRecipeButton:
                    intent = new Intent(MainActivity.this, CreateRecipeActivity.class);

=======
                case R.id.FavoritesButton:
                    intent = new Intent(MainActivity.this, FavoritesActivity.class);
                    break;
>>>>>>> 8ca20bbe8ded1bb5e37dab37030d9e3694af8f3b
            }
            startActivity(intent);
        }
    }
}