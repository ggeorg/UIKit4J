#ifndef _OrgChamomileIosUikitUIImageViewStub_H_
#define _OrgChamomileIosUikitUIImageViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIImageView.h"

@interface UIImageView (JavaUIImageView) <OrgChamomileIosUikitUIImageView>
@end

__attribute__((always_inline)) inline void UIImageView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIImageView)

J2OBJC_TYPE_LITERAL_HEADER(UIImageView)

// Empty class to force category to be loaded.
@interface JavaUIImageViewCategoryDummy : UIImageView
@end

#endif // _OrgChamomileIosUikitUIImageViewStub_H_