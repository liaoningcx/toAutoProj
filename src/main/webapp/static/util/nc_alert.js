/**
 * 提示信息公共工具.
 * User: dbcxue
 * Date: 12-11-13
 * Time: 下午3:44
 */
ShowMessage = (function() {
    return {
        /**
         * 弹出窗口
         *
         * @param _context_ 内容
         * @param _title_ 标题
         * @param _width_ 长度
         * @param _type_ 类型
         * @param _call_back_ 回调函数
         */
        alert : function(_context_, _title_, _width_, _type_, _call_back_,param) {
            if (undefined == _width_) {
                _width_ = 260;
            }

            jqm.alert({
                w : _width_,
                title : _title_,
                type : _type_,
                content : _context_,
                self : self,
                onHide : _call_back_,
                param : param
            });
        },
        /**
         * 错误提示
         *
         * @param _context_ 内容
         * @param _title_ 标题
         * @param _width_ 长度
         * @param _call_back_ 回调函数
         */
        showError : function(_context_, _title_, _width_, _call_back_) {
            if (undefined == _title_) {
                _title_ = "错误";
            } else {
                if ($.isFunction(_title_)) {
                    _call_back_ = _title_;
                    _title_ = "错误";
                } else if (typeof(_title_) == "number") {
                    if (undefined != _width_) {
                        if ($.isFunction(_width_)) {
                            _call_back_ = _width_;
                        }
                    }
                    _width_ = _title_;
                    _title_ = "错误";
                }
            }
            if (undefined != _width_) {
                if ($.isFunction(_width_)) {
                    _call_back_ = _width_;
                    _width_ = undefined;
                }
            }

            Commons.alert(_context_, _title_, _width_, "error", _call_back_);
        },

        /**
         * 警告提示
         *
         * @param _context_ 内容
         * @param _title_ 标题
         * @param _width_ 长度
         * @param _call_back_ 回调函数
         */
        showWarn : function(_context_, _title_, _width_, _call_back_) {
            if (undefined == _title_) {
                _title_ = "警告";
            } else {
                if ($.isFunction(_title_)) {
                    _call_back_ = _title_;
                    _title_ = "警告";
                } else if (typeof(_title_) == "number") {
                    if (undefined != _width_) {
                        if ($.isFunction(_width_)) {
                            _call_back_ = _width_;
                        }
                    }
                    _width_ = _title_;
                    _title_ = "警告";
                }
            }
            if (undefined != _width_) {
                if ($.isFunction(_width_)) {
                    _call_back_ = _width_;
                    _width_ = undefined;
                }
            }

            Commons.alert(_context_, _title_, _width_, "alert", _call_back_);
        },

        /**
         * 普通提示
         *
         * @param _context_ 内容
         * @param _title_ 标题
         * @param _width_ 长度
         * @param _call_back_ 回调函数
         */
        showInfo : function(_context_, _title_, _width_, _call_back_) {
            if (undefined == _title_) {
                _title_ = "提示";
            } else {
                if ($.isFunction(_title_)) {
                    _call_back_ = _title_;
                    _title_ = "提示";
                } else if (typeof(_title_) == "number") {
                    if (undefined != _width_) {
                        if ($.isFunction(_width_)) {
                            _call_back_ = _width_;
                        }
                    }
                    _width_ = _title_;
                    _title_ = "提示";
                }
            }
            if (undefined != _width_) {
                if ($.isFunction(_width_)) {
                    _call_back_ = _width_;
                    _width_ = undefined;
                }
            }

            Commons.alert(_context_, _title_, _width_, "attention", _call_back_);
        },

        /**
         * 成功提示
         *
         * @param _context_ 内容
         * @param _title_ 标题
         * @param _width_ 长度
         * @param _call_back_ 回调函数
         */
        showSuccess : function(_context_, _title_, _width_, _call_back_,param) {
        	 if (undefined == _title_) {
                 _title_ = "成功";
             } else {
                 if ($.isFunction(_title_)) {
                     _call_back_ = _title_;
                     _title_ = "成功";
                     param = _width_;
                     _width_ = undefined;
                 } else if (typeof(_title_) == "number") {
                     if (undefined != _width_) {
                         if ($.isFunction(_width_)) {
                             _call_back_ = _width_;
                             param = _call_back_;
                         }
                     }
                     _width_ = _title_;
                     _title_ = "成功";
                     param = _call_back_;
                 }
             }
             if (undefined != _width_) {
                 if ($.isFunction(_width_)) {
                     _call_back_ = _width_;
                     _width_ = undefined;
                     param = _call_back_;
                 }
             }

             Commons.alert(_context_, _title_, _width_, "success", _call_back_,param);
        },

        /**
         * 失败提示
         *
         * @param _context_ 内容
         * @param _title_ 标题
         * @param _width_ 长度
         * @param _call_back_ 回调函数
         */
        failure : function(_context_, _title_, _width_, _call_back_) {
            if (undefined == _title_) {
                _title_ = "失败";
            }else {
                if ($.isFunction(_title_)) {
                    _call_back_ = _title_;
                    _title_ = "失败";
                } else if (typeof(_title_) == "number") {
                    if (undefined != _width_) {
                        if ($.isFunction(_width_)) {
                            _call_back_ = _width_;
                        }
                    }
                    _width_ = _title_;
                    _title_ = "失败";
                }
            }
            if (undefined != _width_) {
                if ($.isFunction(_width_)) {
                    _call_back_ = _width_;
                    _width_ = undefined;
                }
            }
            Commons.alert(_context_, _title_, _width_, "failure", _call_back_);
        },
        
        /**
         * 确认提示
         *
         * @param _title_ 标题
         * @param callbackFun 回调函数
         * @param paramArray 参数数组
         */
        confirm : function( _title_,callbackFun,paramArray) {
            if (undefined == _title_) {
                return;
            }
            var self = this;
            jqm.confirm({
                w:400,
                title:_title_,
                type:'attention',
                retrieveTop:function(){
                    return 0;
                },
                content:'<h4>确定要提交此操作吗？</h4>',
                self:self,
                onConfirm:function(){
                    if (callbackFun) {
                        if (callbackFun != '' && typeof (callbackFun) == 'function') {
                            if(paramArray == null || typeof (paramArray) == 'undefined') {
                                callbackFun();
                            } else {
                                callbackFun(paramArray);
                            }
                        }
                    }
                }
            });
        }

    }
} )();
