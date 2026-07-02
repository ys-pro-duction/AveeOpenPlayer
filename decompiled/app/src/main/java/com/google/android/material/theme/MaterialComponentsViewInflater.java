package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.daaw.C2848Yg0;
import com.daaw.C4058dh0;
import com.daaw.C6021kh0;
import com.daaw.D9;
import com.daaw.N9;
import com.daaw.Q8;
import com.daaw.S8;
import com.daaw.T9;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends T9 {
    @Override // com.daaw.T9
    public Q8 c(Context context, AttributeSet attributeSet) {
        return new C2848Yg0(context, attributeSet);
    }

    @Override // com.daaw.T9
    public S8 d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // com.daaw.T9
    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // com.daaw.T9
    public D9 k(Context context, AttributeSet attributeSet) {
        return new C4058dh0(context, attributeSet);
    }

    @Override // com.daaw.T9
    public N9 o(Context context, AttributeSet attributeSet) {
        return new C6021kh0(context, attributeSet);
    }
}
