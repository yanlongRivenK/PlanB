package com.pioon.planb.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import com.pioon.planb.R;

import org.jetbrains.annotations.NotNull;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/**
 * Created by yanlongRivenK on 2021/7/27.
 */
class CalendarView extends ConstraintLayout {

    public CalendarView(@NonNull @NotNull Context context) {
        this(context, null, 0);
    }

    public CalendarView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CalendarView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        View inflate = LayoutInflater.from(context).inflate(R.layout.view_calendar, this, true);
        init(inflate);

    }

    private void init(View inflate) {

    }
}
