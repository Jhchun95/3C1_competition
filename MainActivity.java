package com.example.tabtest;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tab;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewPager);

//      tab을 표시할 Adapter 내부 클래스 객체를 만들고 TabLayout과 ViewPager에 추가할 내용을
//      넣어준다.
        MainPagerAdapter adapter = new MainPagerAdapter(getSupportFragmentManager());

//      Fragment 추가 : app에서 우클릭 => New => Fragment => Fragment(Blank)
//      ViewPager에 넣어줄 Fragment 객체를 생성하고 Adapter 클래스 객체에 addItem() 메소드로
//      넣어준다.
        Fragment1 fragment1 = new Fragment1();
        adapter.addItem("Android", fragment1);
        Fragment2 fragment2 = new Fragment2();
        adapter.addItem("Python", fragment2);
        Fragment3 fragment3 = new Fragment3();
        adapter.addItem("Spring", fragment3);

//      ViewPager에 Adapter의 내용을 넣어준다.
        viewPager.setAdapter(adapter);
//      TabLayout을 활성화시킨다.
        tab.setupWithViewPager(viewPager);
    }

//  FragmentPagerAdapter 클래스를 상속받아 tab을 표시할 Adapter 클래스를 만든다.
    class MainPagerAdapter extends FragmentPagerAdapter {

//      TabLayout에 표시될 내용을 기억할 ArrayList를 만든다.
        ArrayList<String> title = new ArrayList<>();
//      ViewPager에 표시될 내용(Fragment)을 기억할 ArrayList를 만든다.
        ArrayList<Fragment> item = new ArrayList<>();

//      클래스 이름위에서 alt + Enter를 눌러서 자동으로 입력한 생성자, 수정하면 안된다.
        public MainPagerAdapter(FragmentManager fm) {
            super(fm);
        }

//      여기부터
        @Override
//      ViewPager에 전개될 레이아웃을 얻어오는 메소드
        public Fragment getItem(int i) {
//          return null;을 아래와 같이 수정한다.
            return item.get(i);
        }

        @Override
//      ViewPager에 전개될 레이아웃의 개수를 얻어오는 메소드
        public int getCount() {
//          return 0;을 아래와 같이 수정한다.
            return item.size();
        }
//      여기까지 클래스 이름위에서 alt + Enter를 눌러서 자동으로 Override한 FragmentPagerAdapter
//      클래스의 추상 메소드

//      alt + Enter를 눌러 TabLayout에 표시할 문자열을 읽어오는 메소드를 Override 한다.
        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
//          return super.getPageTitle(position);을 아래와 같이 수정한다.
            return title.get(position);
        }

//      Adapter에 TabLayout과 ViewPager에 표시할 내용을 추가하는 메소드를 만든다.
//      addItem(TabLayout에 표시될 문자열, ViewPager에 표시될 Fragment 클래스의 객체)
        public void addItem(String title, Fragment fragment) {
            this.title.add(title);      // TabLayout에 표시할 문자열을 ArrayList에 추가한다.
            this.item.add(fragment);    // ViewPager에 표시할 Fragment를 ArrayList에 추가한다.
        }

    }

}
