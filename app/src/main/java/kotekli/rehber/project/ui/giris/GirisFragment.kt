package kotekli.rehber.project.ui.giris

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotekli.rehber.project.R

class GirisFragment : Fragment() {

    private lateinit var girisViewModel: GirisViewModel

    var mWebView: WebView? = null


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        girisViewModel =
                ViewModelProvider(this).get(GirisViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_giris, container, false)


        mWebView = root.findViewById<View>(R.id.webView11) as WebView
        mWebView!!.loadUrl("https://koteklirehber.com/girisyap.php")


        val webSettings = mWebView!!.settings
        webSettings.javaScriptEnabled = true


        mWebView!!.webViewClient = WebViewClient()




        return root
    }
}