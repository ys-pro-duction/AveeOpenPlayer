package com.daaw.avee.comp.InAppBilling;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.billingclient.api.f;
import com.daaw.AY0;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC5056hD0;
import com.daaw.AbstractC9438ws;
import com.daaw.AbstractC9815yD0;
import com.daaw.C8808uf;
import com.daaw.DY0;
import com.daaw.FD0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.JD0;
import com.daaw.PC0;
import com.daaw.WB0;
import com.google.android.gms.ads.RequestConfiguration;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001cR(\u0010(\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/daaw/avee/comp/InAppBilling/StoreItem;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "checked", "Lcom/daaw/G91;", "setChecked", "(Z)V", "c", "()V", "Lcom/android/billingclient/api/f;", "details", "setDetails", "(Lcom/android/billingclient/api/f;)V", "a", "Landroid/widget/RadioButton;", "B", "Landroid/widget/RadioButton;", "button", "Landroid/widget/TextView;", "C", "Landroid/widget/TextView;", "priceTv", "D", "intervalTv", "E", "tagTv", "", "<set-?>", "F", "Ljava/lang/String;", "getSku", "()Ljava/lang/String;", ProxyAmazonBillingActivity.EXTRAS_SKU, "b", "()Z", "isPurchased", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StoreItem extends FrameLayout {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int H = 8;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public RadioButton button;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public TextView priceTv;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public TextView intervalTv;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public TextView tagTv;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public String sku;

    /* JADX INFO: renamed from: com.daaw.avee.comp.InAppBilling.StoreItem$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int b(char c) {
            return c == 'M' ? FD0.h : c == 'Y' ? FD0.j : FD0.i;
        }

        public final void c(TextView textView, String str) {
            String strSubstring = str.substring(1, str.length() - 1);
            G10.f(strSubstring, "substring(...)");
            int i = Integer.parseInt(strSubstring);
            textView.setText(textView.getContext().getResources().getQuantityString(b(DY0.H0(str)), i, Integer.valueOf(i)));
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StoreItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        G10.g(context, "context");
    }

    public final void a() {
        TextView textView = this.tagTv;
        if (!b()) {
            if (G10.c(textView.getText(), textView.getResources().getText(JD0.q6))) {
                textView.setVisibility(4);
            }
        } else {
            textView.setText(JD0.q6);
            textView.setTextColor(AbstractC9438ws.c(textView.getContext(), PC0.d));
            textView.setTextSize(14.0f);
            textView.setVisibility(0);
        }
    }

    public final boolean b() {
        Object objA = WB0.t.a(this.sku, Boolean.FALSE);
        G10.f(objA, "invoke(...)");
        return ((Boolean) objA).booleanValue();
    }

    public final void c() {
        if (b()) {
            return;
        }
        TextView textView = this.tagTv;
        textView.setText(JD0.p6);
        textView.setTextSize(10.0f);
        textView.setVisibility(0);
    }

    public final String getSku() {
        return this.sku;
    }

    public final void setChecked(boolean checked) {
        this.button.setChecked(checked);
    }

    public final void setDetails(f details) {
        G91 g91 = null;
        if (details != null) {
            setVisibility(0);
            this.sku = details.c();
            f.c cVarA = C8808uf.i.a(details);
            if (cVarA != null) {
                TextView textView = this.priceTv;
                String strC = cVarA.c();
                G10.f(strC, "getFormattedPrice(...)");
                textView.setText(AY0.s(strC, " ", " ", false, 4, null));
                Companion companion = INSTANCE;
                TextView textView2 = this.intervalTv;
                String strB = cVarA.b();
                G10.f(strB, "getBillingPeriod(...)");
                companion.c(textView2, strB);
                g91 = G91.a;
            }
        }
        if (g91 == null) {
            setVisibility(8);
        }
    }

    public /* synthetic */ StoreItem(Context context, AttributeSet attributeSet, int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        G10.g(context, "context");
        LayoutInflater.from(context).inflate(AbstractC9815yD0.C0, (ViewGroup) this, true);
        View viewFindViewById = findViewById(AbstractC5056hD0.j0);
        G10.f(viewFindViewById, "findViewById(...)");
        this.button = (RadioButton) viewFindViewById;
        View viewFindViewById2 = findViewById(AbstractC5056hD0.q2);
        G10.f(viewFindViewById2, "findViewById(...)");
        this.priceTv = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(AbstractC5056hD0.y1);
        G10.f(viewFindViewById3, "findViewById(...)");
        this.intervalTv = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(AbstractC5056hD0.s3);
        G10.f(viewFindViewById4, "findViewById(...)");
        this.tagTv = (TextView) viewFindViewById4;
    }
}
