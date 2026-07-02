package com.daaw;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.daaw.DialogFragmentC10212zf1;
import com.daaw.avee.MainActivity;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdapterResponseInfo;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.ResponseInfo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Bf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC0421Bf1 extends DialogFragment {
    public ProgressBar B;
    public TextView C;
    public TextView D;
    public List E = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.Bf1$a */
    public class a extends Dialog {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            DialogFragmentC0421Bf1.this.d();
        }
    }

    public static DialogFragmentC0421Bf1 g() {
        return new DialogFragmentC0421Bf1();
    }

    public final void c(View view) {
        MainActivity.O0.c(this.E);
        AdView adView = (AdView) view.findViewById(AbstractC5056hD0.g);
        AdView adView2 = (AdView) view.findViewById(AbstractC5056hD0.h);
        if (getResources().getConfiguration().orientation == 2) {
            adView.setVisibility(8);
            adView = adView2;
        } else {
            adView2.setVisibility(8);
        }
        if (((Boolean) WB0.m.a(Boolean.FALSE)).booleanValue() && C4989gz0.a.e()) {
            adView.setVisibility(8);
            return;
        }
        adView.setVisibility(0);
        if (e(adView)) {
            return;
        }
        MobileAds.initialize(getActivity());
        adView.loadAd(P2.a.b());
    }

    public final void d() {
        DialogFragmentC10212zf1.Z.a();
    }

    public final boolean e(AdView adView) {
        ResponseInfo responseInfo = adView.getResponseInfo();
        if (responseInfo == null) {
            return false;
        }
        Iterator<AdapterResponseInfo> it = responseInfo.getAdapterResponses().iterator();
        while (it.hasNext()) {
            if (it.next().getAdError() != null) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void f(View view) {
        d();
    }

    public void h(DialogFragmentC10212zf1.f fVar) {
        TextView textView = this.D;
        if (textView == null) {
            return;
        }
        if (fVar.b) {
            textView.setVisibility(0);
            this.D.setText(JD0.r7);
            if (!TextUtils.isEmpty(this.C.getText())) {
                return;
            }
        } else {
            textView.setVisibility(8);
        }
        this.B.getProgressDrawable().setColorFilter(AbstractC1765Ob1.n(this.B, KC0.q), PorterDuff.Mode.SRC_IN);
        this.B.setMax(fVar.d);
        this.B.setProgress(fVar.c);
        float f = fVar.c / fVar.d;
        TextView textView2 = this.C;
        float f2 = f * 100.0f;
        textView2.setText(textView2.getResources().getQuantityString(FD0.l, (int) f2, Float.valueOf(f2)));
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getView());
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        a aVar = new a(getActivity(), C7110oa.a(getActivity()));
        Window window = aVar.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return aVar;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC9815yD0.Q, viewGroup, false);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.B.setProgress(0);
        this.C.setText("");
        super.onDismiss(dialogInterface);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC2317Td1.u0((ViewGroup) view.findViewById(AbstractC5056hD0.s2), ColorStateList.valueOf(AbstractC1765Ob1.m(getActivity().getTheme(), IC0.f)));
        this.D = (TextView) view.findViewById(AbstractC5056hD0.X3);
        this.B = (ProgressBar) view.findViewById(AbstractC5056hD0.r2);
        this.C = (TextView) view.findViewById(AbstractC5056hD0.Y3);
        ImageButton imageButton = (ImageButton) view.findViewById(AbstractC5056hD0.d0);
        imageButton.setColorFilter(AbstractC1765Ob1.m(getActivity().getTheme(), KC0.q));
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.Af1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.B.f(view2);
            }
        });
        c(view);
    }
}
