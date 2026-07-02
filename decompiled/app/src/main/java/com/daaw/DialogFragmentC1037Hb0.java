package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.daaw.Hb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class DialogFragmentC1037Hb0 extends DialogFragment {
    public static C0850Fg1 G = new C0850Fg1();
    public AsyncTask B;
    public int C = GD0.D;
    public String D = "";
    public WebView E;
    public ProgressBar F;

    /* JADX INFO: renamed from: com.daaw.Hb0$a */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("local:")) {
                String[] strArr = new String[2];
                AbstractC0405Bb1.C(str, "//", strArr);
                int iIntValue = ((Integer) DialogFragmentC1037Hb0.G.a(strArr[1], 0)).intValue();
                if (iIntValue > 0) {
                    DialogFragmentC1037Hb0.this.f(iIntValue);
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hb0$b */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hb0$c */
    public class c extends AsyncTask {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(DialogFragmentC1037Hb0.this.getActivity().getResources().openRawResource(this.a)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                } catch (IOException unused) {
                }
                return sb.toString();
            }
            bufferedReader.close();
            return sb.toString();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (DialogFragmentC1037Hb0.this.getActivity() == null || isCancelled()) {
                return;
            }
            DialogFragmentC1037Hb0.this.F.setVisibility(4);
            DialogFragmentC1037Hb0.this.E.setVisibility(0);
            DialogFragmentC1037Hb0.this.E.loadDataWithBaseURL("file:///android_asset/" + DialogFragmentC1037Hb0.this.D, str, "text/html", "utf-8", null);
            DialogFragmentC1037Hb0.this.B = null;
        }
    }

    public static void e(FragmentManager fragmentManager, boolean z, int i, int i2, String str) {
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("nz.net.speakman.androidlicensespage.LicensesFragment");
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        fragmentTransactionBeginTransaction.addToBackStack(null);
        g(z, i, i2, str).show(fragmentTransactionBeginTransaction, "nz.net.speakman.androidlicensespage.LicensesFragment");
    }

    public static DialogFragmentC1037Hb0 g(boolean z, int i, int i2, String str) {
        DialogFragmentC1037Hb0 dialogFragmentC1037Hb0 = new DialogFragmentC1037Hb0();
        Bundle bundle = new Bundle();
        bundle.putBoolean("keyShowCloseButton", z);
        bundle.putInt("licenseResId", i);
        bundle.putInt("titleResId", i2);
        bundle.putString("extraUrl", str);
        dialogFragmentC1037Hb0.setArguments(bundle);
        return dialogFragmentC1037Hb0;
    }

    public final void f(int i) {
        this.B = new c(i).execute(new Void[0]);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        f(this.C);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        View viewInflate = LayoutInflater.from(getActivity()).inflate(AbstractC9815yD0.p0, (ViewGroup) null);
        WebView webView = (WebView) viewInflate.findViewById(AbstractC5056hD0.L1);
        this.E = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.F = (ProgressBar) viewInflate.findViewById(AbstractC5056hD0.K1);
        this.E.setWebViewClient(new a());
        Bundle arguments = getArguments();
        int i = 0;
        if (arguments != null) {
            z = arguments.getBoolean("keyShowCloseButton");
            this.C = arguments.getInt("licenseResId", GD0.D);
            i = arguments.getInt("titleResId", 0);
            this.D = arguments.getString("extraUrl", "");
        } else {
            z = false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (i != 0) {
            builder.setTitle(getString(i));
        }
        builder.setView(viewInflate);
        if (z) {
            builder.setNegativeButton(getActivity().getResources().getString(JD0.V0), new b());
        }
        h(builder);
        return builder.create();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.B;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
    }

    public void h(AlertDialog.Builder builder) {
    }
}
