package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.AbstractC5894kD0;
import com.daaw.BD0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {
    public final Chip b0;
    public final Chip c0;
    public final ClockHandView d0;
    public final ClockFaceView e0;
    public final MaterialButtonToggleGroup f0;
    public final View.OnClickListener g0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    public class c implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector B;

        public c(GestureDetector gestureDetector) {
            this.B = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.B.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface d {
    }

    public interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ e u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ d v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.c0.sendAccessibilityEvent(8);
        }
    }

    public final void w() {
        this.b0.setTag(AbstractC5894kD0.E, 12);
        this.c0.setTag(AbstractC5894kD0.E, 10);
        this.b0.setOnClickListener(this.g0);
        this.c0.setOnClickListener(this.g0);
        this.b0.setAccessibilityClassName("android.view.View");
        this.c0.setAccessibilityClassName("android.view.View");
    }

    public final void x() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.b0.setOnTouchListener(cVar);
        this.c0.setOnTouchListener(cVar);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g0 = new a();
        LayoutInflater.from(context).inflate(BD0.n, this);
        this.e0 = (ClockFaceView) findViewById(AbstractC5894kD0.i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(AbstractC5894kD0.l);
        this.f0 = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.b
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i2, boolean z) {
                this.a.getClass();
            }
        });
        this.b0 = (Chip) findViewById(AbstractC5894kD0.o);
        this.c0 = (Chip) findViewById(AbstractC5894kD0.m);
        this.d0 = (ClockHandView) findViewById(AbstractC5894kD0.j);
        x();
        w();
    }
}
