package com.daaw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Space;
import com.daaw.NU0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OU0 extends PopupWindow {
    public static C1058Hg1 c = new C1058Hg1();
    public static C0529Cg1 d = new C0529Cg1();
    public List a;
    public List b;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ InterfaceC5694jX a;

        public a(InterfaceC5694jX interfaceC5694jX) {
            this.a = interfaceC5694jX;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            OU0.this.c(-1, this.a);
        }
    }

    public class b implements RadioGroup.OnCheckedChangeListener {
        public final /* synthetic */ InterfaceC5694jX a;

        public b(InterfaceC5694jX interfaceC5694jX) {
            this.a = interfaceC5694jX;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            OU0.this.c(-1, this.a);
        }
    }

    public OU0(View view, String str) {
        super(view.getContext(), (AttributeSet) null, 0, RD0.k);
        this.a = null;
        this.b = null;
        d(view.getContext(), view, str);
    }

    public static OU0 b(View view, String str) {
        return new OU0(view, str);
    }

    public final void c(int i, InterfaceC5694jX interfaceC5694jX) {
        List<RadioButton> list = this.a;
        if (list == null || this.b == null) {
            return;
        }
        int iIntValue = 0;
        int iIntValue2 = 0;
        for (RadioButton radioButton : list) {
            if (radioButton.isChecked()) {
                iIntValue2 = ((Integer) radioButton.getTag()).intValue();
            }
        }
        for (CheckBox checkBox : this.b) {
            if (checkBox.isChecked()) {
                iIntValue |= ((Integer) checkBox.getTag()).intValue();
            }
        }
        d.a(Integer.valueOf(i), interfaceC5694jX, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    public void d(Context context, View view, String str) {
        NU0.i iVar = (NU0.i) c.a(-1, null, str, null);
        View viewInflate = View.inflate(view.getContext(), AbstractC9815yD0.W, null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(AbstractC5056hD0.C1);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(AbstractC5056hD0.w2);
        Space space = (Space) viewInflate.findViewById(AbstractC5056hD0.Y2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        this.a = new ArrayList(iVar == null ? 0 : iVar.a.size());
        this.b = new ArrayList(iVar == null ? 0 : iVar.b.size());
        if (iVar != null) {
            for (B61 b61 : iVar.a) {
                RadioButton radioButton = new RadioButton(context);
                radioButton.setTag((Integer) b61.a);
                radioButton.setText(((Integer) b61.b).intValue());
                radioGroup.addView(radioButton, layoutParams);
                if (((Integer) b61.a).intValue() == iVar.c) {
                    radioGroup.check(radioButton.getId());
                }
                this.a.add(radioButton);
            }
            if (iVar.b.size() > 0) {
                space.setVisibility(0);
            } else {
                space.setVisibility(8);
            }
            for (B61 b612 : iVar.b) {
                CheckBox checkBox = new CheckBox(context);
                checkBox.setTag((Integer) b612.a);
                checkBox.setText(((Integer) b612.b).intValue());
                if ((((Integer) b612.a).intValue() & iVar.d) != 0) {
                    checkBox.setChecked(true);
                }
                linearLayout.addView(checkBox, layoutParams);
                checkBox.setOnCheckedChangeListener(new a(null));
                this.b.add(checkBox);
            }
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
