#ifndef _OrgChamomileIosWebkitWKWebViewStub_H_
#define _OrgChamomileIosWebkitWKWebViewStub_H_

#include <WebKit/WebKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "WKWebView.h"

@interface WKWebView (JavaWKWebView) <OrgChamomileIosWebkitWKWebView>

- (instancetype)initWithOrgChamomileIosWebkitWKWebViewConfiguration:(id<OrgChamomileIosWebkitWKWebViewConfiguration>)configuration;

@end
/*
__attribute__((always_inline)) inline void WKWebView_init(NSObject *self) {
    [self initWithFrame:CGRectMake(0, 0, 0, 0)];
}
*/

J2OBJC_EMPTY_STATIC_INIT(WKWebView)

FOUNDATION_EXPORT void WKWebView_init(WKWebView *self);

FOUNDATION_EXPORT WKWebView *new_WKWebView_init() NS_RETURNS_RETAINED;

FOUNDATION_EXPORT WKWebView *create_WKWebView_init();

FOUNDATION_EXPORT void WKWebView_initWithOrgChamomileIosWebkitWKWebViewConfiguration_(WKWebView *self, id<OrgChamomileIosWebkitWKWebViewConfiguration> configuration);

FOUNDATION_EXPORT WKWebView *new_WKWebView_initWithOrgChamomileIosWebkitWKWebViewConfiguration_(id<OrgChamomileIosWebkitWKWebViewConfiguration> configuration) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT WKWebView *create_WKWebView_initWithOrgChamomileIosWebkitWKWebViewConfiguration_(id<OrgChamomileIosWebkitWKWebViewConfiguration> configuration);

J2OBJC_TYPE_LITERAL_HEADER(WKWebView)

// Empty class to force category to be loaded.
@interface JavaWKWebViewCategoryDummy : WKWebView
@end

#endif // _OrgChamomileIosWebkitWKWebViewStub_H_