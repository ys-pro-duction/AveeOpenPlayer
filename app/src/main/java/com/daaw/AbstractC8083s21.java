package com.daaw;

import android.view.inputmethod.EditorInfo;
import com.daaw.FY;
import com.daaw.W70;
import com.daaw.X70;

/* JADX INFO: renamed from: com.daaw.s21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8083s21 {
    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void b(EditorInfo editorInfo, GY gy, C3601c21 c3601c21) {
        G10.g(editorInfo, "<this>");
        G10.g(gy, "imeOptions");
        G10.g(c3601c21, "textFieldValue");
        int iD = gy.d();
        FY.a aVar = FY.b;
        int i = 6;
        if (FY.l(iD, aVar.a())) {
            if (!gy.f()) {
                i = 0;
            }
        } else if (FY.l(iD, aVar.e())) {
            i = 1;
        } else if (FY.l(iD, aVar.c())) {
            i = 2;
        } else if (FY.l(iD, aVar.d())) {
            i = 5;
        } else if (FY.l(iD, aVar.f())) {
            i = 7;
        } else if (FY.l(iD, aVar.g())) {
            i = 3;
        } else if (FY.l(iD, aVar.h())) {
            i = 4;
        } else if (!FY.l(iD, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        int iE = gy.e();
        X70.a aVar2 = X70.a;
        if (X70.k(iE, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (X70.k(iE, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (X70.k(iE, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (X70.k(iE, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (X70.k(iE, aVar2.i())) {
            editorInfo.inputType = 17;
        } else if (X70.k(iE, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (X70.k(iE, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (X70.k(iE, aVar2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!X70.k(iE, aVar2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!gy.f() && a(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (FY.l(gy.d(), aVar.a())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (a(editorInfo.inputType, 1)) {
            int iC = gy.c();
            W70.a aVar3 = W70.a;
            if (W70.f(iC, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (W70.f(iC, aVar3.d())) {
                editorInfo.inputType |= 8192;
            } else if (W70.f(iC, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (gy.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = G21.j(c3601c21.b());
        editorInfo.initialSelEnd = G21.g(c3601c21.b());
        AbstractC8141sF.f(editorInfo, c3601c21.c());
        editorInfo.imeOptions |= 33554432;
    }
}
