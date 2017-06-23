#ifndef _OrgChamomileIosUikitUIViewControllerStub_H_
#define _OrgChamomileIosUikitUIViewControllerStub_H_

#import <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIViewController.h"

@interface UIViewController (JavaUIViewController) <OrgChamomileIosUikitUIViewController>

@end

__attribute__((always_inline)) inline void UIViewController_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIViewController)

J2OBJC_TYPE_LITERAL_HEADER(UIViewController)

// Empty class to force category to be loaded.
@interface JavaUIViewControllerCategoryDummy : UIViewController
@end

#endif // _OrgChamomileIosUikitUIViewControllerStub_H_
