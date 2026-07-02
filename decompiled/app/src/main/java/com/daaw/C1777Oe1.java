package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Oe1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1777Oe1 extends PopupWindow {
    public static C1058Hg1 c = new C1058Hg1();
    public static C0425Bg1 d = new C0425Bg1();
    public List a;
    public List b;

    /* JADX INFO: renamed from: com.daaw.Oe1$a */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ InterfaceC5694jX a;

        public a(InterfaceC5694jX interfaceC5694jX) {
            this.a = interfaceC5694jX;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C1777Oe1.this.c(-1, this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Oe1$b */
    public class b implements RadioGroup.OnCheckedChangeListener {
        public final /* synthetic */ InterfaceC5694jX a;

        public b(InterfaceC5694jX interfaceC5694jX) {
            this.a = interfaceC5694jX;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            C1777Oe1.this.c(-1, this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Oe1$c */
    public static class c {
        public int a;
        public boolean b;
    }

    public C1777Oe1(View view, String str) {
        super(view.getContext(), (AttributeSet) null, 0, RD0.k);
        this.a = null;
        this.b = null;
        d(view.getContext(), view, str);
    }

    public static C1777Oe1 b(View view, String str) {
        return new C1777Oe1(view, str);
    }

    public final void c(int i, InterfaceC5694jX interfaceC5694jX) {
        if (this.a == null || this.b == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.size()) {
                i2 = 0;
                break;
            } else if (((RadioButton) this.a.get(i2)).isChecked()) {
                break;
            } else {
                i2++;
            }
        }
        c cVar = new c();
        cVar.a = i2;
        cVar.b = ((CheckBox) this.b.get(0)).isChecked();
        d.a(Integer.valueOf(i), interfaceC5694jX, cVar);
    }

    public void d(Context context, View view, String str) {
        c cVar = (c) c.a(-1, null, str, null);
        View viewInflate = View.inflate(view.getContext(), AbstractC9815yD0.w0, null);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(AbstractC5056hD0.w2);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.a.add((RadioButton) viewInflate.findViewById(AbstractC5056hD0.z2));
        this.a.add((RadioButton) viewInflate.findViewById(AbstractC5056hD0.y2));
        this.a.add((RadioButton) viewInflate.findViewById(AbstractC5056hD0.x2));
        this.b.add((CheckBox) viewInflate.findViewById(AbstractC5056hD0.u0));
        int i = cVar.a;
        if (i >= 0 && i < this.a.size()) {
            radioGroup.check(((RadioButton) this.a.get(cVar.a)).getId());
        }
        ((CheckBox) this.b.get(0)).setChecked(cVar.b);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((CheckBox) it.next()).setOnCheckedChangeListener(new a(null));
        }
        radioGroup.setOnCheckedChangeListener(new b(null));
        setContentView(viewInflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        showAsDropDown(view);
    }
}
