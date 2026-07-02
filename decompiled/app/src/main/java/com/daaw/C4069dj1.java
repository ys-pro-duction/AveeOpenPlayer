package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.daaw.dj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4069dj1 extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    public C4069dj1(C4069dj1 c4069dj1) {
        this.c = null;
        this.d = AbstractC3512bj1.H;
        if (c4069dj1 != null) {
            this.a = c4069dj1.a;
            this.b = c4069dj1.b;
            this.c = c4069dj1.c;
            this.d = c4069dj1.d;
        }
    }

    public boolean a() {
        return this.b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C3790cj1(this, resources);
    }
}
