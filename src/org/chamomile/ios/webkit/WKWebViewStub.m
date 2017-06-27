#import "WKWebViewStub.h"

#import "J2ObjC_source.h"
#import "../core/graphics/CGRect.h"

@implementation WKWebView (JavaWKWebView)

/*
J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  WKWebView_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END
*/

- (instancetype)initWithOrgChamomileIosWebkitWKWebViewConfiguration:(id<OrgChamomileIosWebkitWKWebViewConfiguration>)configuration {
  WKWebView_initWithOrgChamomileIosWebkitWKWebViewConfiguration_(self, configuration);
  return self;
}
    
+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, NULL, 0x1, -1, 0, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosUikitUIScrollView;", 0x1, 1, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 2, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosFoundationNSURL;", 0x1, 3, -1, -1, -1, -1, -1 },
    { NULL, "LNSString;", 0x1, 4, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 5, 6, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKNavigationDelegate;", 0x1, 7, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 8, 9, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKUIDelegate;", 0x1, 10, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 11, 12, -1, -1, -1, -1 },
    { NULL, "D", 0x1, 13, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKNavigation;", 0x1, 14, 15, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKNavigation;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKNavigation;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 16, 17, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKBackForwardList;", 0x1, 18, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "Z", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x1, 19, 17, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKNavigation;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKNavigation;", 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "LOrgChamomileIosWebkitWKNavigation;", 0x1, 20, 21, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initWithOrgChamomileIosWebkitWKWebViewConfiguration:);
  methods[2].selector = @selector(scrollView);
  methods[3].selector = @selector(title);
  methods[4].selector = @selector(URL);
  methods[5].selector = @selector(customUserAgent);
  methods[6].selector = @selector(setCustomUserAgent:);
  methods[7].selector = @selector(navigationDelegate);
  methods[8].selector = @selector(setNavigationDelegate:);
  methods[9].selector = @selector(UIDelegate);
  methods[10].selector = @selector(setUIDelegate:);
  methods[11].selector = @selector(estimatedProgress);
  methods[12].selector = @selector(hasOnlySecureContent);
  methods[13].selector = @selector(loadHTMLString:baseURL:);
  methods[14].selector = @selector(isLoading);
  methods[15].selector = @selector(reload);
  methods[16].selector = @selector(reloadFromOrigin);
  methods[17].selector = @selector(stopLoading);
  methods[18].selector = @selector(allowsBackForwardNavigationGestures);
  methods[19].selector = @selector(setAllowsBackForwardNavigationGestures:);
  methods[20].selector = @selector(backForwardList);
  methods[21].selector = @selector(canGoBack);
  methods[22].selector = @selector(canGoForward);
  methods[23].selector = @selector(allowsLinkPreview);
  methods[24].selector = @selector(setAllowsLinkPreview:);
  methods[25].selector = @selector(goBack);
  methods[26].selector = @selector(goForward);
  methods[27].selector = @selector(loadRequest:);
  #pragma clang diagnostic pop
  static const void *ptrTable[] = { "LOrgChamomileIosWebkitWKWebViewConfiguration;", "getScrollView", "getTitle", "getURL",
   "getCustomUserAgent", "setCustomUserAgent", "LNSString;", "getNavigationDelegate", "setNavigationDelegate",
   "LOrgChamomileIosWebkitWKNavigationDelegate;", "getUIDelegate", "setUIDelegate", "LOrgChamomileIosWebkitWKUIDelegate;", 
   "getEstimatedProgress", "loadHTMLString", "LNSString;LOrgChamomileIosFoundationNSURL;", "setAllowsBackForwardNavigationGestures", 
   "Z", "getBackForwardList", "setAllowsLinkPreview", "loadRequest", "LOrgChamomileIosFoundationNSURLRequest;" };
  static const J2ObjcClassInfo _WKWebView = { "WKWebViewStub", "org.chamomile.ios.webkit", ptrTable, methods, NULL, 7, 0x1, 28, 0, -1, -1, -1, -1, -1 };
  return &_WKWebView;
}

#include "WKWebViewStubImpl.h"

@end

void WKWebView_init(WKWebView *self) {
  //UIView_init(self);
  //[self initWithFrame:CGRectMake(0, 0, 0, 0)];
  static IMP initImp;
  static dispatch_once_t token;
  dispatch_once(token, ^{
    initImp = [WKWebView instanceMethodForSelector:@selector(init)];
  });
  ((id (*)(id, SEL))initImp)(self, @selector(init));
}

WKWebView *new_WKWebView_init() {
  J2OBJC_NEW_IMPL(WKWebView, init)
}

WKWebView *create_WKWebView_init() {
  J2OBJC_CREATE_IMPL(WKWebView, init)
}

void WKWebView_initWithOrgChamomileIosWebkitWKWebViewConfiguration_(WKWebView *self, id<OrgChamomileIosWebkitWKWebViewConfiguration> configuration) {
  //UIView_init(self);
  [self initWithFrame:CGRectMake(0, 0, 0, 0) configuration:(WKWebViewConfiguration *)configuration];
}

WKWebView *new_WKWebView_initWithOrgChamomileIosWebkitWKWebViewConfiguration_(id<OrgChamomileIosWebkitWKWebViewConfiguration> configuration) {
  J2OBJC_NEW_IMPL(WKWebView, initWithOrgChamomileIosWebkitWKWebViewConfiguration_, configuration)
}

WKWebView *create_WKWebView_initWithOrgChamomileIosWebkitWKWebViewConfiguration_(id<OrgChamomileIosWebkitWKWebViewConfiguration> configuration) {
  J2OBJC_CREATE_IMPL(WKWebView, initWithOrgChamomileIosWebkitWKWebViewConfiguration_, configuration)
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(WKWebView)

// Empty class to force category to be loaded.
@implementation JavaWKWebViewCategoryDummy
@end
