package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.daaw.NW;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class UO extends AbstractC6851ne implements NW.a {
    public boolean A;
    public boolean B;
    public TextView v;
    public TextView w;
    public String x;
    public int y;
    public int z;

    public UO(Context context, ViewGroup viewGroup, int i) {
        super(AbstractC1765Ob1.p(context).inflate(i == 2 ? AbstractC9815yD0.a0 : AbstractC9815yD0.Z, viewGroup, false), 1, true);
        this.x = null;
        this.y = 0;
        this.z = 0;
        this.A = false;
        this.B = false;
        View view = this.a;
        this.v = (TextView) view.findViewById(AbstractC5056hD0.u3);
        this.w = (TextView) view.findViewById(AbstractC5056hD0.v3);
    }

    @Override // com.daaw.AbstractC6851ne, com.daaw.AbstractC1464Le
    public void Q(NW nw, int i) {
        super.Q(nw, i);
        this.v.setText("");
        this.w.setText("");
        nw.n(new WeakReference(this));
        R();
    }

    public final void S() {
        String str = this.x;
        String quantityString = "";
        if (str != null) {
            this.v.setText(str);
            this.w.setText("");
            return;
        }
        if (this.B) {
            this.v.setText(JD0.c3);
            this.w.setText("");
            return;
        }
        if (this.A) {
            this.v.setText(JD0.b5);
            if (this.y >= 0) {
                Resources resources = this.w.getResources();
                int i = FD0.g;
                int i2 = this.y;
                quantityString = resources.getQuantityString(i, i2, Integer.valueOf(i2));
            }
            this.w.setText(quantityString);
            return;
        }
        if (this.y == 0) {
            this.v.setText(JD0.c4);
            this.w.setText("");
            return;
        }
        this.v.setText("");
        Resources resources2 = this.w.getResources();
        int i3 = FD0.g;
        int i4 = this.y;
        this.w.setText(resources2.getQuantityString(i3, i4, Integer.valueOf(i4)));
    }

    @Override // com.daaw.NW.a
    public void a(String str) {
        this.x = str;
        S();
    }

    @Override // com.daaw.NW.a
    public void b(int i, int i2, boolean z, boolean z2) {
        this.y = i;
        this.z = i2;
        this.A = z;
        this.B = z2;
        S();
    }

    public final void R() {
    }
}
