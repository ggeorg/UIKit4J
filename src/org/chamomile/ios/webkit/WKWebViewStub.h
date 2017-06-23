#ifndef _OrgChamomileIosWebkitWKWebViewStub_H_
#define _OrgChamomileIosWebkitWKWebViewStub_H_

#include <WebKit/WebKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "WKWebView.h"

@interface WKWebView (JavaWKWebView) <OrgChamomileIosWebkitWKWebView>
@end

__attribute__((always_inline)) inline void WKWebView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(WKWebView)

J2OBJC_TYPE_LITERAL_HEADER(WKWebView)

// Empty class to force category to be loaded.
@interface JavaWKWebViewCategoryDummy : WKWebView
@end

#endif // _OrgChamomileIosWebkitWKWebViewStub_H_