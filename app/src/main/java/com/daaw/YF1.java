package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class YF1 extends RelativeLayout {
    public static final float[] C = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    public AnimationDrawable B;

    public YF1(Context context, XF1 xf1, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        AbstractC7506py0.l(xf1);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(C, null, null));
        shapeDrawable.getPaint().setColor(xf1.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(xf1.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(xf1.zzg());
            textView.setTextColor(xf1.zze());
            textView.setTextSize(xf1.a3());
            zzay.zzb();
            int iB = XS1.B(context, 4);
            zzay.zzb();
            textView.setPadding(iB, 0, XS1.B(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listB3 = xf1.b3();
        if (listB3 != null && listB3.size() > 1) {
            this.B = new AnimationDrawable();
            Iterator it = listB3.iterator();
            while (it.hasNext()) {
                try {
                    this.B.addFrame((Drawable) BinderC7744qp0.I(((BinderC4501fG1) it.next()).zzf()), xf1.zzb());
                } catch (Exception e) {
                    AbstractC4274eT1.zzh("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.B);
        } else if (listB3.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) BinderC7744qp0.I(((BinderC4501fG1) listB3.get(0)).zzf()));
            } catch (Exception e2) {
                AbstractC4274eT1.zzh("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.B;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
