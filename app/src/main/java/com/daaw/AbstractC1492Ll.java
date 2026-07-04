package com.daaw;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.daaw.Ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1492Ll {
    public static final long a = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: com.daaw.Ll$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ View B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(0);
            this.B = view;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AbstractC1492Ll.e(this.B));
        }
    }

    public static final long b() {
        return a;
    }

    public static final boolean c(KeyEvent keyEvent) {
        G10.g(keyEvent, "$this$isClick");
        if (!K70.e(L70.b(keyEvent), K70.a.b())) {
            return false;
        }
        int iB = V70.b(L70.a(keyEvent));
        return iB == 23 || iB == 66 || iB == 160;
    }

    public static final LQ d(InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-1990508712);
        a aVar = new a((View) interfaceC5781jp.O(B5.i()));
        interfaceC5781jp.L();
        return aVar;
    }

    public static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
