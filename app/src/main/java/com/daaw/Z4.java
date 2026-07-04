package com.daaw;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import com.daaw.C2323Tf;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z4 {
    public static final BlendMode a(int i) {
        C2323Tf.a aVar = C2323Tf.b;
        return C2323Tf.G(i, aVar.a()) ? BlendMode.CLEAR : C2323Tf.G(i, aVar.x()) ? BlendMode.SRC : C2323Tf.G(i, aVar.g()) ? BlendMode.DST : C2323Tf.G(i, aVar.B()) ? BlendMode.SRC_OVER : C2323Tf.G(i, aVar.k()) ? BlendMode.DST_OVER : C2323Tf.G(i, aVar.z()) ? BlendMode.SRC_IN : C2323Tf.G(i, aVar.i()) ? BlendMode.DST_IN : C2323Tf.G(i, aVar.A()) ? BlendMode.SRC_OUT : C2323Tf.G(i, aVar.j()) ? BlendMode.DST_OUT : C2323Tf.G(i, aVar.y()) ? BlendMode.SRC_ATOP : C2323Tf.G(i, aVar.h()) ? BlendMode.DST_ATOP : C2323Tf.G(i, aVar.C()) ? BlendMode.XOR : C2323Tf.G(i, aVar.t()) ? BlendMode.PLUS : C2323Tf.G(i, aVar.q()) ? BlendMode.MODULATE : C2323Tf.G(i, aVar.v()) ? BlendMode.SCREEN : C2323Tf.G(i, aVar.s()) ? BlendMode.OVERLAY : C2323Tf.G(i, aVar.e()) ? BlendMode.DARKEN : C2323Tf.G(i, aVar.o()) ? BlendMode.LIGHTEN : C2323Tf.G(i, aVar.d()) ? BlendMode.COLOR_DODGE : C2323Tf.G(i, aVar.c()) ? BlendMode.COLOR_BURN : C2323Tf.G(i, aVar.m()) ? BlendMode.HARD_LIGHT : C2323Tf.G(i, aVar.w()) ? BlendMode.SOFT_LIGHT : C2323Tf.G(i, aVar.f()) ? BlendMode.DIFFERENCE : C2323Tf.G(i, aVar.l()) ? BlendMode.EXCLUSION : C2323Tf.G(i, aVar.r()) ? BlendMode.MULTIPLY : C2323Tf.G(i, aVar.n()) ? BlendMode.HUE : C2323Tf.G(i, aVar.u()) ? BlendMode.SATURATION : C2323Tf.G(i, aVar.b()) ? BlendMode.COLOR : C2323Tf.G(i, aVar.p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i) {
        C2323Tf.a aVar = C2323Tf.b;
        return C2323Tf.G(i, aVar.a()) ? PorterDuff.Mode.CLEAR : C2323Tf.G(i, aVar.x()) ? PorterDuff.Mode.SRC : C2323Tf.G(i, aVar.g()) ? PorterDuff.Mode.DST : C2323Tf.G(i, aVar.B()) ? PorterDuff.Mode.SRC_OVER : C2323Tf.G(i, aVar.k()) ? PorterDuff.Mode.DST_OVER : C2323Tf.G(i, aVar.z()) ? PorterDuff.Mode.SRC_IN : C2323Tf.G(i, aVar.i()) ? PorterDuff.Mode.DST_IN : C2323Tf.G(i, aVar.A()) ? PorterDuff.Mode.SRC_OUT : C2323Tf.G(i, aVar.j()) ? PorterDuff.Mode.DST_OUT : C2323Tf.G(i, aVar.y()) ? PorterDuff.Mode.SRC_ATOP : C2323Tf.G(i, aVar.h()) ? PorterDuff.Mode.DST_ATOP : C2323Tf.G(i, aVar.C()) ? PorterDuff.Mode.XOR : C2323Tf.G(i, aVar.t()) ? PorterDuff.Mode.ADD : C2323Tf.G(i, aVar.v()) ? PorterDuff.Mode.SCREEN : C2323Tf.G(i, aVar.s()) ? PorterDuff.Mode.OVERLAY : C2323Tf.G(i, aVar.e()) ? PorterDuff.Mode.DARKEN : C2323Tf.G(i, aVar.o()) ? PorterDuff.Mode.LIGHTEN : C2323Tf.G(i, aVar.q()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
