package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class R32 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context B;
    public View C;

    public R32(Context context) {
        super(context);
        this.B = context;
    }

    public static R32 a(Context context, View view, C4498fF2 c4498fF2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        R32 r32 = new R32(context);
        if (!c4498fF2.w.isEmpty() && (resources = r32.B.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f = ((C4787gF2) c4498fF2.w.get(0)).a;
            float f2 = displayMetrics.density;
            r32.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (r1.b * f2)));
        }
        r32.C = view;
        r32.addView(view);
        zzt.zzx();
        JT1.b(r32, r32);
        zzt.zzx();
        JT1.a(r32, r32);
        JSONObject jSONObject = c4498fF2.j0;
        RelativeLayout relativeLayout = new RelativeLayout(r32.B);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            r32.c(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            r32.c(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        r32.addView(relativeLayout);
        return r32;
    }

    public final int b(double d) {
        zzay.zzb();
        return XS1.B(this.B, (int) d);
    }

    public final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.B);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iB = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iB, 0, iB);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.C.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.C.setY(-r0[1]);
    }
}
